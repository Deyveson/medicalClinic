import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {AppointmentComponent} from './appointment.component';

@NgModule({
  declarations: [
    AppointmentComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [AppointmentComponent]
})
export class AppointmentModule { }
