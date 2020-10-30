import { Component, OnInit, Input } from '@angular/core';
import { Component1Component } from 'src/app/component1/component1.component';

@Component({
  selector: 'app-component2',
  templateUrl: './component2.component.html',
  styleUrls: ['./component2.component.css']
})
export class Component2Component implements OnInit {
  @Input()
  text:string;
  
  constructor() { 
    
  }
  

  ngOnInit(): void {
  }

}
