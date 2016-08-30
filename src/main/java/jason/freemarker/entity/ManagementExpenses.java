package jason.freemarker.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Created by Jason on 2016-08-30.
 */
@Entity
@Data
public class ManagementExpenses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate targetDate; // 대상년월
    private Long value1; // 일반관리비
    private Long value2; // 청소비
    private Long value3; // 소독비
    private Long value4; // 승강기 유지비
    private Long value5; // 경비비
    private Long value6; // 위탁관리 수수료
    private Long value7; // 가스사용료
    private Long value8; // 정화조 오물 수수료
    private Long value9; // 생활 폐기물 수수료
    private Long value10; // 대표회의 운영비
    private Long value11; // 건물 보험료
    private Long value12; // 선거관리 운영비
    private Long value13; // 전기 // 세대 사용량
    private Long value14; // 전기료
    private Long value15; // TV 시청료
    private Long value16; // 공동 전기료
    private Long value17; // 승강기 전기료
    private Long value18; // 수도 // 사용량
    private Long value19; // 수도료
    private Long value20; // 하수도료
    private Long value21; // 공동 수수료
    private Long value22; // 장기수선 충당금
    private Long value23; // 추가 주차비
}
