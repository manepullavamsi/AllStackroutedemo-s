import { Component, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-component3',
  templateUrl: './component3.component.html',
  styleUrls: ['./component3.component.css']
})
export class Component3Component implements OnInit {
  @Output() comp1=new EventEmitter<string>();
  Send(data)
  {
    this.comp1.emit(data);
  }
  constructor() { }

  ngOnInit(): void {
  }

}
