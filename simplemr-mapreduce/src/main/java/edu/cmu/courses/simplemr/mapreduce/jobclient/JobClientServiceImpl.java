package edu.cmu.courses.simplemr.mapreduce.jobclient;

import edu.cmu.courses.simplemr.mapreduce.common.JobConfig;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class JobClientServiceImpl extends UnicastRemoteObject implements JobClientService {

    private JobClient jobClient;

    public JobClientServiceImpl(JobClient jobClient) throws RemoteException {
        super();
        this.jobClient = jobClient;
    }

    @Override
    public void submitJob(JobConfig jobConfig) throws RemoteException {

    }
}