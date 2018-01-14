package com.springboot.arjun.FirstGroovy.model

import org.hibernate.annotations.CollectionId

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name="queue_details")
class QueueDetails {
    @Column(name="id")
    @Id
    Integer id
    @Column(name="name")
    String name

    @JoinColumn(name="repoNo")
    @OneToOne
    Repo repoNo
}
