package net.ny;

import com.google.common.collect.Lists;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.zip.DeflaterOutputStream;
import javax.annotation.Nullable;
import net.ny.f;

public class i {
   private static final byte[] v = new byte[4096];
   private final File N;
   private RandomAccessFile q;
   private final int[] U = new int[1024];
   private final int[] k = new int[1024];
   private List J;
   private int s;
   private long x;

   public i(File var1) {
      this.N = var1;
      this.s = 0;
      if(var1.exists()) {
         this.x = var1.lastModified();
      }

      this.q = new RandomAccessFile(var1, "rw");
      if(this.q.length() < 4096L) {
         this.q.write(v);
         this.q.write(v);
         this.s += 8192;
      }

      if((this.q.length() & 4095L) != 0L) {
         for(int var2 = 0; (long)var2 < (this.q.length() & 4095L); ++var2) {
            this.q.write(0);
         }
      }

      int var6 = (int)this.q.length() / 4096;
      this.J = Lists.newArrayListWithCapacity(var6);

      for(int var3 = 0; var3 < var6; ++var3) {
         this.J.add(Boolean.valueOf(true));
      }

      this.J.set(0, Boolean.valueOf(false));
      this.J.set(1, Boolean.valueOf(false));
      this.q.seek(0L);
      int var7 = 0;

      while(true) {
         int var4 = this.q.readInt();
         this.U[var7] = var4;
         if((var4 >> 8) + (var4 & 255) <= this.J.size()) {
            for(int var5 = 0; var5 < (var4 & 255); ++var5) {
               this.J.set((var4 >> 8) + var5, Boolean.valueOf(false));
            }
         }

         ++var7;
      }
   }

   @Nullable
   public synchronized DataInputStream z(int var1, int var2) {
      if(this.G(var1, var2)) {
         return null;
      } else {
         int var3 = this.p(var1, var2);
         return null;
      }
   }

   @Nullable
   public DataOutputStream y(int var1, int var2) {
      return this.G(var1, var2)?null:new DataOutputStream(new BufferedOutputStream(new DeflaterOutputStream(new i.x(var1, var2))));
   }

   protected synchronized void S(int var1, int var2, byte[] var3, int var4) {
      String[] var5 = f.h();
      int var6 = this.p(var1, var2);
      int var7 = var6 >> 8;
      int var8 = var6 & 255;
      int var9 = (var4 + 5) / 4096 + 1;
      if(var9 < 256) {
         if(var7 != 0 && var8 == var9) {
            this.O(var7, var3, var4);
         }

         int var10 = 0;
         if(var10 < var8) {
            this.J.set(var7 + var10, Boolean.valueOf(true));
            ++var10;
         }

         var10 = this.J.indexOf(Boolean.valueOf(true));
         byte var11 = 0;
         if(var10 != -1 && var10 < this.J.size()) {
            if(((Boolean)this.J.get(var10)).booleanValue()) {
               var10 = var10;
               var11 = 1;
            }

            if(var11 >= var9) {
               ;
            }

            int var12 = var10 + 1;
         }

         if(var11 >= var9) {
            this.y(var1, var2, var10 << 8 | var9);
            int var16 = 0;
            if(var16 < var9) {
               this.J.set(var10 + var16, Boolean.valueOf(false));
               ++var16;
            }

            this.O(var10, var3, var4);
         }

         this.q.seek(this.q.length());
         var7 = this.J.size();
         int var18 = 0;
         if(var18 < var9) {
            this.q.write(v);
            this.J.add(Boolean.valueOf(false));
            ++var18;
         }

         this.s += 4096 * var9;
         this.O(var7, var3, var4);
         this.y(var1, var2, var7 << 8 | var9);
         this.b(var1, var2, (int)(net.nx.f.X() / 1000L));
      }
   }

   private void O(int var1, byte[] var2, int var3) throws IOException {
      this.q.seek((long)(var1 * 4096));
      this.q.writeInt(var3 + 1);
      this.q.writeByte(2);
      this.q.write(var2, 0, var3);
   }

   private boolean G(int var1, int var2) {
      return var1 >= 32 || var2 >= 32;
   }

   private int p(int var1, int var2) {
      return this.U[var1 + var2 * 32];
   }

   public boolean f(int var1, int var2) {
      return this.p(var1, var2) != 0;
   }

   private void y(int var1, int var2, int var3) throws IOException {
      this.U[var1 + var2 * 32] = var3;
      this.q.seek((long)((var1 + var2 * 32) * 4));
      this.q.writeInt(var3);
   }

   private void b(int var1, int var2, int var3) throws IOException {
      this.k[var1 + var2 * 32] = var3;
      this.q.seek((long)(4096 + (var1 + var2 * 32) * 4));
      this.q.writeInt(var3);
   }

   public void K() throws IOException {
      if(this.q != null) {
         this.q.close();
      }

   }

   private static Exception a(Exception var0) {
      return var0;
   }

   class x extends ByteArrayOutputStream {
      private final int b;
      private final int a;

      public x(int var2, int var3) {
         super(8096);
         this.b = var2;
         this.a = var3;
      }

      public void close() throws IOException {
         i.this.S(this.b, this.a, this.buf, this.count);
      }
   }
}
