package com.sun.jna;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

class c1 {
   private static final byte[] S = new byte[]{(byte)127, (byte)69, (byte)76, (byte)70};
   private static final int O = 1024;
   private static final int h = 512;
   private static final int G = 2;
   private static final int p = 40;
   private static final int i = 2;
   private final String J;
   private boolean K = false;
   private boolean r = false;
   private boolean X = false;
   private boolean m = false;
   private boolean n = false;
   private boolean l = false;

   public static c1 B(String var0) throws IOException {
      c1 var1 = new c1(var0);
      var1.H();
      return var1;
   }

   public boolean G() {
      return this.K;
   }

   public boolean A() {
      return this.r;
   }

   public boolean h() {
      return this.X;
   }

   public String J() {
      return this.J;
   }

   public boolean P() {
      return this.m;
   }

   public boolean F() {
      return this.n;
   }

   public boolean R() {
      return this.l;
   }

   private c1(String var1) {
      this.J = var1;
   }

   private void H() throws IOException {
      RandomAccessFile var1 = new RandomAccessFile(this.J, "r");
      if(var1.length() > 4L) {
         byte[] var2 = new byte[4];
         var1.seek(0L);
         var1.read(var2);
         if(Arrays.equals(var2, S)) {
            this.K = true;
         }
      }

      if(this.K) {
         var1.seek(4L);
         byte var5 = var1.readByte();
         this.r = var5 == 2;
         var1.seek(0L);
         ByteBuffer var3 = ByteBuffer.allocate(this.r?64:52);
         var1.getChannel().read(var3, 0L);
         this.X = var3.get(5) == 2;
         var3.order(this.X?ByteOrder.BIG_ENDIAN:ByteOrder.LITTLE_ENDIAN);
         this.l = var3.get(18) == 40;
         if(this.l) {
            int var4 = var3.getInt(this.r?48:36);
            this.n = (var4 & 512) == 512;
            this.m = (var4 & 1024) == 1024;
         }

      }
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
