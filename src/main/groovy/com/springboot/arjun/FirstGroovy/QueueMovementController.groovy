package com.springboot.arjun.FirstGroovy

import com.springboot.arjun.FirstGroovy.model.MyQueue
import com.springboot.arjun.FirstGroovy.model.QueueDetails
import com.springboot.arjun.FirstGroovy.service.QueueService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class QueueMovementController {

    @Autowired
    QueueService queueService

    @RequestMapping(value = "/queue", method = RequestMethod.GET)
    MyQueue getQueueDetails(@RequestParam Integer applicationNo){
      QueueDetails queueDetails = queueService.getOne(applicationNo)
      MyQueue myQueue = new MyQueue(id: queueDetails.id, queueName: queueDetails.name, files: ['fileName':queueDetails.repoNo.fileName] )
      myQueue
    }
}