import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PrudhviComponent } from './prudhvi.component';

describe('PrudhviComponent', () => {
  let component: PrudhviComponent;
  let fixture: ComponentFixture<PrudhviComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PrudhviComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PrudhviComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
