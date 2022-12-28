package com.mysite.nexfilx.order.service;

import com.mysite.nexfilx.User.dao.UserRepository;
import com.mysite.nexfilx.order.dao.OrderRepository;
import com.mysite.nexfilx.order.domain.Payorder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final UserRepository userRepository;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    int num = 1;
=======

    int num = 3;

>>>>>>> 3829c5d0c0aa8e1ee313a05338bf0ced2bfdcdab

=======

    int num = 3;

>>>>>>> 3829c5d0c0aa8e1ee313a05338bf0ced2bfdcdab
=======
    int num = 1;
>>>>>>> master

    LocalDate currentDate = LocalDate.now();
//    LocalDate myDate = LocalDate.of();


    public Payorder setOrder(Payorder payorder) {

        Date nowDate = payorder.getOrderDate();
//        LocalDate localDate = nowDate.toInstant()   // Date -> Instant
//                .atZone(ZoneId.systemDefault())  // Instant -> ZonedDateTime
//                .toLocalDate(); // ZonedDateTime -> LocalDate
//        System.out.println(currentDate.plusDays(30));
//        System.out.println(localDate);
//        if (currentDate.plusDays(30).isBefore(localDate)) {
//            System.out.println("조건문 통과 !!!");
//            return null;
//        }

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");   // yyyy-MM-dd HH:mm:ss
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 03da3c737a3760947dad5d4eea6d20a607a22188
=======

>>>>>>> 3829c5d0c0aa8e1ee313a05338bf0ced2bfdcdab
=======

>>>>>>> 3829c5d0c0aa8e1ee313a05338bf0ced2bfdcdab
=======
=======

>>>>>>> 03da3c737a3760947dad5d4eea6d20a607a22188
>>>>>>> master
//        System.out.printf("Date" + formatter.format(nowDate));

        String format = formatter.format(nowDate)+"-000-" + num;
        num++;
        payorder.setOrderNum(format);
        orderRepository.save(payorder);
//        userRepository.save()

        return payorder;
    }

    public List<Payorder> orderEmail(Payorder payorder) {
//        List<Payorder> payorderList = new ArrayList<>();
        List<Payorder> opPayOrder = orderRepository.findAllByUseremail(payorder.getUseremail());
        return opPayOrder;
    }


//    public Payorder orderEmail(Payorder payorder) {
//        Optional<Payorder> opPayorder = orderRepository.findByUseremail(payorder.getUseremail());
//        if(opPayorder.isPresent()) {
//            Payorder orderUser = opPayorder.get();
//            System.out.println(orderUser.getUseremail());
//            System.out.println(payorder.getUseremail());
//            if(orderUser.getUseremail().equals(payorder.getUseremail())){
//                return orderUser;
//            }
//            return null;
//        }
//        return null;
//    }
}
