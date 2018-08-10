import { Component, OnInit } from "@angular/core";
import { CoffeeService } from "../coffee.service";
import { Coffee } from "../coffee";

@Component({
  selector: "app-list",
  templateUrl: "./list.component.html",
  styleUrls: ["./list.component.css"]
})
export class ListComponent implements OnInit {
  coffeeList: Coffee[] = [];

  getCoffee(): void {
    this.coffeeService.getCoffee().subscribe(data => (this.coffeeList = data));
  }

  constructor(private coffeeService: CoffeeService) {}

  ngOnInit() {
    this.getCoffee();
  }
}
