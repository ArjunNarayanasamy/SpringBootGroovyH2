package com.springboot.arjun.FirstGroovy.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="REPO")
class Repo {

    @Id
    @Column(name="repo_No")
    Integer repoNo

    @Column(name = "file_Name")
    String fileName
}
