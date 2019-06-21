package com.mycompany.myapp.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.mycompany.myapp.domain.Result;
import com.mycompany.myapp.repository.ResultRepository;
import com.mycompany.myapp.service.ResultService;
import com.mycompany.myapp.service.dto.ResultDTO;
import com.mycompany.myapp.service.dto.ResultUpdateDTO;
import com.mycompany.myapp.service.mapper.ResultMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ResultServiceImpl implements ResultService {
    public final static String AUTH_KEY_FCM = "AAAAgL09NmY:APA91bHbfvB_n0orObvIU1BIvd4FB_nlf2YSofHgEgZBdA60ruQXGWUEQBlYyOartmywxoXE0ER1ZgkkDePkknGPxDP56k4BK-6PM0SjRk9oUkag48e7ZQyACjmDm-CI17KtzYWdmD5P";
    public final static String API_URL_FCM = "https://fcm.googleapis.com/fcm/send";
    public final static String token = "fZwfDyFSGho:APA91bGJvD5YFLrMqlBtgHbwFpdilsCS-8nhZpq_PsYzV_DZ_06OqLNA0a9WcCdQSUy4fxcFSPGwfQ3VEDXKC-6a-LxbIdKTSPkTAKJ98YnE7vKdIMcr3x_n9u--RWxpv3kZboVL0cMU";
    private final Logger log = LoggerFactory.getLogger(ResultServiceImpl.class);
    private ResultRepository resultRepository;

    @Autowired
    private ResultMapper resultMapper;

    public ResultServiceImpl(ResultRepository result) {
        this.resultRepository = result;
    }

    @Override
    public ResultDTO save(ResultDTO resultDTO) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        resultDTO.setCreate_date(dateFormat.format(date));
        // resultDTO.setRegional(1L);
        ResultDTO rs = resultMapper.toDto(resultRepository.save(resultMapper.toEntity(resultDTO)));
        return rs;
    }

    @Override
    public Optional<ResultDTO> findOne(Long id) {
        return null;
    }

    @Override
    public List<ResultDTO> findAll() {
        return null;
    }

    @Override
    public ResultUpdateDTO findByRegionAndDate(Long regional, String date) {
        ResultUpdateDTO resultDTO = new ResultUpdateDTO();
        List<Result> listResult = resultRepository.findByRegionAndDate(regional, date);
        List<String> listSpecial = new ArrayList<String>();
        List<String> listFirst = new ArrayList<String>();
        List<String> listSecond = new ArrayList<String>();
        List<String> listThird = new ArrayList<String>();
        List<String> listFourth = new ArrayList<String>();
        List<String> listFifth = new ArrayList<String>();
        List<String> listSixth = new ArrayList<String>();
        List<String> listSeventh = new ArrayList<String>();
        listResult.forEach(rs -> {
            if (rs.getFirst() != "" && rs.getFirst() != null) {
                listFirst.add(rs.getFirst());
            }
            if (rs.getSpecial() != "" && rs.getSpecial() != null) {
                listSpecial.add(rs.getSpecial());
            }
            if (rs.getSecond() != "" && rs.getSecond() != null) {
                listSecond.add(rs.getSecond());
            }
            if (rs.getThird() != "" && rs.getThird() != null) {
                listThird.add(rs.getThird());
            }
            if (rs.getFourth() != "" && rs.getFourth() != null) {
                listFourth.add(rs.getFourth());
            }
            if (rs.getFifth() != "" && rs.getFifth() != null) {
                listFifth.add(rs.getFifth());
            }
            if (rs.getSixth() != "" && rs.getSixth() != null) {
                listSixth.add(rs.getSixth());
            }
            if (rs.getSeventh() != "" && rs.getSeventh() != null) {
                listSeventh.add(rs.getSeventh());
            }
        });
        resultDTO.setSpecial(listSpecial);
        resultDTO.setFirst(listFirst);
        resultDTO.setSecond(listSecond);
        resultDTO.setThird(listThird);
        resultDTO.setFourth(listFourth);
        resultDTO.setFifth(listFifth);
        resultDTO.setSixth(listSixth);
        resultDTO.setSeventh(listSeventh);
        return resultDTO;
    }

    @Override
    public String pushNotification(ResultDTO resultDTO) {
        String result = "";
        URL url;
        HttpURLConnection conn = null;
        JSONObject json = new JSONObject();
        try {
            url = new URL(API_URL_FCM);
            conn = (HttpURLConnection) url.openConnection();
            conn.setUseCaches(false);
            conn.setDoInput(true);
            conn.setDoOutput(true);

            conn.setRequestMethod("POST");
            conn.setRequestProperty("Authorization", "key=" + AUTH_KEY_FCM);
            conn.setRequestProperty("Content-Type", "application/json");
            json.put("to", token.trim());
            JSONObject info = new JSONObject();
            info.put("title", getTitle(resultDTO)); // Notification title
            info.put("body", getBody(resultDTO)); // Notification
                                              // body
            json.put("notification", info);
        } catch (MalformedURLException e1) {
            // TODO Auto-generated catch block
            log.error("MalformedURLException: " + e1.getMessage());
            e1.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            log.error("IOException: " + e.getMessage());
            e.printStackTrace();
        } catch (JSONException e1) {
            log.error("JSONException: " + e1.getMessage());
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try {
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(json.toString());
            wr.flush();

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            result = "SUCCESS";
        } catch (Exception e) {
            log.error("Exception: " + e.getMessage());
            e.printStackTrace();
            result = "FAILURE";
        }
        System.out.println("GCM Notification is sent successfully");

        return result;
    }

    public String getTitle(ResultDTO resultDTO) {
        if (resultDTO.getFifth() != null) {
            return "Giai Nhat";
        } else if (resultDTO.getSecond() != null) {
            return "Giai Nhi";
        } else if (resultDTO.getThird() != null) {
            return "Giai Ba";
        } else if (resultDTO.getFourth() != null) {
            return "Giai Bon";
        } else if (resultDTO.getFifth() != null) {
            return "Giai Nam";
        } else if (resultDTO.getSixth() != null) {
            return "Giai Sau";
        } else if (resultDTO.getSeventh() != null) {
            return "Giai Bay";
        } else if (resultDTO.getSpecial() != null) {
            return "Giai Dac Biet";
        }
        return "Khong co giai";
    }

    public String getBody(ResultDTO resultDTO) {
        if (resultDTO.getFifth() != null) {
            return resultDTO.getFifth();
        } else if (resultDTO.getSecond() != null) {
            return resultDTO.getSecond();
        } else if (resultDTO.getThird() != null) {
            return resultDTO.getThird();
        } else if (resultDTO.getFourth() != null) {
            return resultDTO.getFourth();
        } else if (resultDTO.getFifth() != null) {
            return resultDTO.getFifth();
        } else if (resultDTO.getSixth() != null) {
            return resultDTO.getSixth();
        } else if (resultDTO.getSeventh() != null) {
            return resultDTO.getSeventh();
        } else if (resultDTO.getSpecial() != null) {
            return resultDTO.getSpecial();
        }
        return "Khong co giai";
    }
}