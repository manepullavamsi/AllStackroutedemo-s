import { Component, OnInit, ViewChild } from '@angular/core';


@Component({
  selector: 'app-component1',
  templateUrl: './component1.component.html',
  styleUrls: ['./component1.component.css']
})
export class Component1Component implements OnInit {
  data:string=""
  send(value){
    this.data=value;
  }
  constructor() { }

  ngOnInit(): void {
  }

}
