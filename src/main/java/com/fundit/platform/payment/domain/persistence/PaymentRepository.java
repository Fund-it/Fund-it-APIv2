package com.fundit.platform.payment.domain.persistence;

import com.fundit.platform.payment.domain.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;


@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment findByDate(Date date);

}
