select s.student_id , s.student_name, sb.subject_name,
(
    select count(1) from examinations
    where student_id = s.student_id
    and subject_name = sb.subject_name
)
as attended_exams from students s 
join subjects sb
order by s.student_id , sb.subject_name;
