import { Component, OnInit } from '@angular/core';
import { HttpService } from '../services/http.service';
import { character } from '../shared/character';
import { ActivatedRoute } from '@angular/router';





@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']

})
export class HomeComponent implements OnInit {
  listcharacter: Array<character>= new Array<character>();
    displayedColumns: string[] = ['idcharacter', 'namecharacter','descrition'];
    dataSource: Array<character>= new Array<character>();
    images:String[] = [];

  
  constructor(private httpService:HttpService,private route:ActivatedRoute) { 
    this.listcharacter = new Array<character>();
    
    this.route.queryParams.subscribe(data=>{
        console.log(data);
        this.Search();
    });
    
  }


  Search():void{

    this.httpService.getcharacter()
    .subscribe((result: character[])=>{
      this.listcharacter=result;
      this.dataSource = this.listcharacter; 

    })
    
  }


  ngOnInit(): void {
  

  }
}
