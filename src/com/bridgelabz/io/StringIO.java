package com.bridgelabz.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StringIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
						String[] arr1={"chicks","duck","turtle","dog"};
						String[] arr2={"chick","quack","nerp-nerp","bow wow"};
						try
						{
							FileInputStream file=new FileInputStream("f://dem.txt");
							byte b[]=new byte [file.available()];
							file.read(b);
							String s=new String(b);
							
							for(int i=0;i<arr1.length;i++)
							{
							try
							{
							 String s1=s.replace("%ANIMAL%",arr1[i]);
							 String s2=s1.replace("%SOUND%",arr2[i]);
								FileOutputStream f=new FileOutputStream("F://demo.txt");
								byte b1[]=s2.getBytes();
								f.write(b1);
								f.close();
									
								}
								catch (Exception e)
								{
										e.printStackTrace();
								}
								
						}

						}
						catch (Exception e)
						{
							e.printStackTrace();
						}
						

					}
				}
				
				
						