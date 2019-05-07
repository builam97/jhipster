import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root'
})
export class ResultLotteryService {
    private url = '/api/createResult';
    constructor(private http: HttpClient) {}
    createResult(param: any): Observable<any> {
        return this.http.post<any>(this.url, param);
    }
}
