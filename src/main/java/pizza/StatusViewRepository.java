package pizza;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StatusViewRepository extends CrudRepository<StatusView, Long> {

    //LDH 중복 삭제
    List<StatusView> findByOrderId(Long orderId);
}