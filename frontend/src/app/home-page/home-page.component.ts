import { Component, OnInit } from '@angular/core';
import { HomeServiceService } from '../services/home-service.service';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.scss']
})
export class HomePageComponent implements OnInit {

  categoriesData : any =[];

  constructor(private homeService : HomeServiceService) { }

  ngOnInit(): void {
    this.initCategories();
  }

  initCategories(){
    this.homeService.getCategories().subscribe(data =>{
      this.categoriesData = data;
      console.log(this.categoriesData);
    });
  }
}
