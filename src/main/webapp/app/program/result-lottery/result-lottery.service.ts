import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root'
})
export class ResultLotteryService {
    private url = '/api/createResult';
    private notification = '/api/push-notification';
    constructor(private http: HttpClient) {}
    createResult(param: any): Observable<any> {
        return this.http.post<any>(this.url, param);
    }

    pushNotification(body): Observable<any> {
        return this.http.post<any>(this.notification, body);
    }
}
