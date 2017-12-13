package com.dtg.sample;

class ProjectVersion {
    Integer major
    Integer minor
    Boolean release

    ProjectVersion (Integer major, Integer minor, Boolean release) {
        this.major = major
        this.minor = minor
        this.release = release
    }

    ProjectVersion (Integer major, Integer minor) {
        this.major = major
        this.minor = minor
        this.release = Boolean.FALSE
    }

    @Override 
    String toString() {
        "$major.$minor${ release ?  '' : '-SNAPSHOT'}"
    }
}