import { Component, OnInit } from '@angular/core';
import { IResult } from 'app/shared/models/result-lottery.model';
import { ResultLotteryService } from '../result-lottery.service';

@Component({
    selector: 'jhi-result-lottery',
    templateUrl: './result-lottery.component.html',
    styles: []
})
export class ResultLotteryComponent implements OnInit {
    result: IResult;
    isSaving: Boolean;
    constructor(private service: ResultLotteryService) {}

    ngOnInit() {}
    previousState() {}
    save() {
        this.service.createResult(this.result).subscribe(res => {
            console.log('response ', res);
        });
    }
}
