import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ResultLotteryComponent } from './result-lottery/result-lottery.component';
import { ResultLotteryRoutingModule } from './result-lottery-routing.module';
import { FormsModule } from '@angular/forms';

@NgModule({
    declarations: [ResultLotteryComponent],
    imports: [CommonModule, ResultLotteryRoutingModule, FormsModule]
})
export class ResultLotteryModule {}
