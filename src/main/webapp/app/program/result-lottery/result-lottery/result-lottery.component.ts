import { Component, OnInit } from '@angular/core';
import { IResult, Result } from 'app/shared/models/result-lottery.model';
import { ResultLotteryService } from '../result-lottery.service';

@Component({
    selector: 'jhi-result-lottery',
    templateUrl: './result-lottery.component.html',
    styles: []
})
export class ResultLotteryComponent implements OnInit {
    result: Result = new Result();
    isSaving: Boolean;
    token =
        'fZwfDyFSGho:APA91bGJvD5YFLrMqlBtgHbwFpdilsCS-8nhZpq_PsYzV_DZ_06OqLNA0a9WcCdQSUy4fxcFSPGwfQ3VEDXKC-6a-LxbIdKTSPkTAKJ98YnE7vKdIMcr3x_n9u--RWxpv3kZboVL0cMU';
    constructor(private service: ResultLotteryService) {}

    ngOnInit() {}
    previousState() {}
    save() {
        this.service.createResult(this.result).subscribe(res => {
            this.service.pushNotification(res).subscribe(resss => {});
        });
    }
}
