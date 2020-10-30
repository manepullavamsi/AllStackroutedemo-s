import { Component, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-component2',
  templateUrl: './component2.component.html',
  styleUrls: ['./component2.component.css']
})
export class Component2Component implements OnInit {
  @Output() comp2=new EventEmitter<string>();
  Send(data:string)
  {
    this.comp2.emit(data);
  }
  constructor() { }

  ngOnInit(): void {
  }

}
