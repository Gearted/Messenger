import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-messagerie',
  templateUrl: './messagerie.component.html',
  styleUrls: ['./messagerie.component.scss']
})
export class MessagerieComponent {
    messageForm = new FormGroup({
        message: new FormControl('', [Validators.required, Validators.minLength(10)])
      });
    constructor() { }
  onSubmit() {
      console.log(this.messageForm.value);
    }
}
