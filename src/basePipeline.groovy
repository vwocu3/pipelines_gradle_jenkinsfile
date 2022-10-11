#!/usr/bin/env groovy

class BasePipeline {

def run(){} //(main call method that will include methods described bellow)

def build(){}      //(run build)

def test(){}       //(run test)

def publishResult(){}     //(attach build result to build artifacts)

def publishArtifacts(){}  //copy build artifacts to SFTP server

}      


class MavenPipeline {}
class CPlusPlusPipeline {}


