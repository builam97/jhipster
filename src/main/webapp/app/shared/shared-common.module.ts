import { NgModule } from '@angular/core';

import { KqxsappSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [KqxsappSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [KqxsappSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class KqxsappSharedCommonModule {}
