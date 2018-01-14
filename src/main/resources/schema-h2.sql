CREATE TABLE REPO (
    repo_No NUMBER(50) NOT NULL,
    file_Name varchar2(200) NOT NULL
);
CREATE TABLE queue_details
        (
        id NUMBER(50) NOT NULL,
        name VARCHAR2(50) NOT NULL,
        repo_No NUMBER(50) NOT NULL,
        FOREIGN KEY (repo_No) REFERENCES REPO(repo_No)
        );
