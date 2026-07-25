import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CourseListComponent } from './pages/course-list/course-list';
import { HeaderComponent } from './components/header/header';
import { HomeComponent } from './pages/home/home';
import { EnrollmentFormComponent } from './pages/enrollment-form/enrollment-form';
@Component({
  selector: 'app-root',
  imports: [
  RouterOutlet,
  HeaderComponent,
  HomeComponent,
  CourseListComponent,
  EnrollmentFormComponent
],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class AppComponent {

}