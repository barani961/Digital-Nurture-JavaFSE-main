import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CourseCardComponent } from '../../components/course-card/course-card';

@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [CommonModule, CourseCardComponent],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseListComponent implements OnInit {

  isLoading = true;

  selectedCourseId: number | null = null;

  courses = [
    {
      id: 1,
      name: 'Angular',
      code: 'ANG101',
      credits: 4,
      gradeStatus: 'passed'
    },
    {
      id: 2,
      name: 'Java Programming',
      code: 'JAVA201',
      credits: 3,
      gradeStatus: 'failed'
    },
    {
      id: 3,
      name: 'Spring Boot',
      code: 'SB301',
      credits: 4,
      gradeStatus: 'pending'
    },
    {
      id: 4,
      name: 'Python',
      code: 'PY401',
      credits: 2,
      gradeStatus: 'passed'
    },
    {
      id: 5,
      name: 'React JS',
      code: 'RE501',
      credits: 1,
      gradeStatus: 'pending'
    }
  ];

  ngOnInit(): void {
    setTimeout(() => {
      this.isLoading = false;
    }, 1500);
  }

  onEnroll(courseId: number): void {
    this.selectedCourseId = courseId;
  }

  // trackBy improves performance by reusing DOM elements.
  trackByCourseId(index: number, course: any): number {
    return course.id;
  }
}