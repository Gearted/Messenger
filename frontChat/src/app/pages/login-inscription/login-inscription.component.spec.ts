import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginInscriptionComponent } from './login-inscription.component';

describe('LoginInscriptionComponent', () => {
  let component: LoginInscriptionComponent;
  let fixture: ComponentFixture<LoginInscriptionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LoginInscriptionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LoginInscriptionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});