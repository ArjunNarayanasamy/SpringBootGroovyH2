package com.springboot.arjun.FirstGroovy.service

import com.springboot.arjun.FirstGroovy.model.QueueDetails
import org.springframework.data.jpa.repository.JpaRepository

interface QueueService extends JpaRepository<QueueDetails,Integer>{
}