package net;

import java.net.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;

public class xw {
   private String d = null;
   private int Z = 0;
   private Proxy g = Proxy.NO_PROXY;
   private String E = null;
   private String H = null;
   private String F = null;
   private Map Y = new LinkedHashMap();
   private byte[] J = null;
   private int h = 0;
   public static final String t = "GET";
   public static final String S = "HEAD";
   public static final String q = "POST";
   public static final String k = "HTTP/1.0";
   public static final String w = "HTTP/1.1";

   public xw(String var1, int var2, Proxy var3, String var4, String var5, String var6, Map var7, byte[] var8) {
      this.d = var1;
      this.Z = var2;
      this.g = var3;
      this.E = var4;
      this.H = var5;
      this.F = var6;
      this.Y = var7;
      this.J = var8;
   }

   public String L() {
      return this.d;
   }

   public int p() {
      return this.Z;
   }

   public String R() {
      return this.E;
   }

   public String u() {
      return this.H;
   }

   public String G() {
      return this.F;
   }

   public Map R() {
      return this.Y;
   }

   public byte[] r() {
      return this.J;
   }

   public int H() {
      return this.h;
   }

   public void F(int var1) {
      this.h = var1;
   }

   public Proxy J() {
      return this.g;
   }
}
