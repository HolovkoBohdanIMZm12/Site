package com.SemRMI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.rmi.RemoteException;
import java.util.Timer;
import java.util.TimerTask;

import lpi.server.rmi.IServer;
import lpi.server.rmi.IServer.FileInfo;
import lpi.server.rmi.IServer.Message;

@SuppressWarnings("unused")
public class Some_Imp 
{
	static IServer proxy;
	static String sessionID = null;
	
	//======
	
	public class RunMeTask extends TimerTask
	{

		@Override
		public void run() 
		{
			System.out.println();
		}
		
	}
	
	TimerTask task = new RunMeTask();
	Timer timer = new Timer();
//	timer.schedule(task, 1000, 30000);
	
	//======

	
		
}
