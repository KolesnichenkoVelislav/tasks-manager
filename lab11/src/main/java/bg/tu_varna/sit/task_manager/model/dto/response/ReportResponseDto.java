package bg.tu_varna.sit.task_manager.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/***
 * Добавено в лабораторно упражнение 7
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ReportResponseDto {
    private long id;
    private String content;
    private int hoursWorked;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
    private TaskResponseDto task;
}
