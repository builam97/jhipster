import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { ResultLotteryComponent } from './result-lottery/result-lottery.component';

const routes: Routes = [
    {
        path: 'result',
        component: ResultLotteryComponent,
        children: []
    }
];
@NgModule({
    declarations: [],
    imports: [CommonModule, RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class ResultLotteryRoutingModule {}
