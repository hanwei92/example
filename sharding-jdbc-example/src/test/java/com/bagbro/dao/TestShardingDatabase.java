package com.bagbro.dao;

import com.bagbro.ShardingBootApplication;
import com.bagbro.entity.BOrder;
import com.bagbro.entity.Position;
import com.bagbro.entity.PositionDetail;
import com.bagbro.repository.BOrderRepository;
import com.bagbro.repository.PositionDetailRepository;
import com.bagbro.repository.PositionRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Optional;
import java.util.Random;

/**
 * @Auther: Bag Bro
 * @Date: 2020/12/8 11:35
 * @Description:
 * @Version: 1.0
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingBootApplication.class)
public class TestShardingDatabase {

    @Resource
    private PositionRepository positionRepository;
    @Resource
    private PositionDetailRepository positionDetailRepository;
    @Resource
    private BOrderRepository bOrderRepository;

    @Test
    @Repeat(100)
    public void testBOrder(){
        Random random = new Random();
        int companyId = random.nextInt(10);
        BOrder order = new BOrder();
        order.setCompanyId(companyId);
        order.setPositionId(371893719L);
        order.setUserId(367198L);
        bOrderRepository.save(order);
    }

    @Test
    public void testQuery(){
        log.info("######查询ds0库数据######");
        Optional<Position> optional = positionRepository.findById(543089674881597440L);
        Position position1 = optional.get();
        log.info("position1:{}",position1.toString());
    }


    @Test
    public void testAdd2(){
        for (int i = 1; i <= 20; i++) {
            Position position = new Position();
            position.setName("bagbro_"+i);
            position.setSalary("350000");
            position.setCity("shenzhen");
            positionRepository.save(position);
            PositionDetail positionDetail = new PositionDetail();
            positionDetail.setPid(position.getId());
            positionDetail.setDescription("this is a description " + i);
            positionDetailRepository.save(positionDetail);
        }

    }

    @Test
    public void testAdd(){
        for (int i = 1; i <= 20; i++) {
            Position position = new Position();
            position.setName("bagbro_"+i);
            position.setSalary("350000");
            position.setCity("shenzhen");
            positionRepository.save(position);
        }
    }
}
