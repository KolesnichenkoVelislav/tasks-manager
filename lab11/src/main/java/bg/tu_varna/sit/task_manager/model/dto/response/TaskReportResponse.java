package bg.tu_varna.sit.task_manager.model.dto.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

/***
 * Добавено в лабораторно упражнение 7
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TaskReportResponse {
    private TaskResponseDto task;
    private LocalTime totalWorkedTime;
}
