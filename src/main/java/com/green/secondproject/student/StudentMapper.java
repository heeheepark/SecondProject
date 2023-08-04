package com.green.secondproject.student;

import com.green.secondproject.student.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    int delStudent(StudentDelDto dto);
    List<StudentMockSumResultVo> selMockTestResultByDates(StudentSummarySubjectDto dto);
    List<StudentSummarySubjectVo> getHighestRatingsOfMockTest(Long userId);
    List<StudentSummarySubjectVo> getLatestRatingsOfMockTest(StudentSummarySubjectDto dto);
    List<StudentTestSumGraphVo> getMockTestGraph(StudentSummarySubjectDto dto);


    List<StudentAcaResultVo> selAcaTestResultByDatesAndPeriod(StudentAcaResultsParam param);
    List<StudentSummarySubjectVo> getHighestRatingsOfAcaTest(StudentSummarySubjectDto dto);
    List<StudentSummarySubjectVo> getLatestRatingsOfAcaTest(StudentSummarySubjectDto dto);


}
