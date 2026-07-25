import {
  Component,
  Input,
  Output,
  EventEmitter,
  OnChanges,
  SimpleChanges
} from '@angular/core';

import { CommonModule } from '@angular/common';
import { CreditLabelPipe } from '../../pipes/credit-label-pipe';
import { HighlightDirective } from '../../directives/highlight';

@Component({
  selector: 'app-course-card',
  standalone: true,
  imports: [
    CommonModule,
    CreditLabelPipe,
    HighlightDirective
  ],
  templateUrl: './course-card.html',
  styleUrl: './course-card.css'
})
export class CourseCardComponent implements OnChanges {

  @Input()
  course: any;

  @Output()
  enrollRequested = new EventEmitter<number>();

  isExpanded = false;

  isEnrolled = false;

  ngOnChanges(changes: SimpleChanges): void {
    console.log(changes);
  }

  enroll(): void {

    this.isEnrolled = true;

    this.enrollRequested.emit(this.course.id);

  }

  toggleDetails(): void {

    this.isExpanded = !this.isExpanded;

  }

  // Getter keeps template clean and readable.
  get cardClasses() {
    return {
      'card--enrolled': this.isEnrolled,
      'card--full': this.course?.credits >= 4,
      'expanded': this.isExpanded
    };
  }

  get borderColor(): string {

    switch (this.course?.gradeStatus) {

      case 'passed':
        return 'green';

      case 'failed':
        return 'red';

      default:
        return 'gray';

    }

  }

  get gradeText(): string {

    switch (this.course?.gradeStatus) {

      case 'passed':
        return 'Passed';

      case 'failed':
        return 'Failed';

      default:
        return 'Pending';

    }

  }

}