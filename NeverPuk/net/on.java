package net;

import java.nio.ByteBuffer;
import net.bt;
import net.uv;
import net.xn;
import net.y.d;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class on implements bt {
   private int o = GL11.glGenTextures();
   private final int r = 15;

   public on(int var1, int var2) {
      byte[] var3 = this.u(var1, var2);
      ByteBuffer var4 = BufferUtils.createByteBuffer(var3.length);
      var4.put(var3);
      var4.flip();
      d.z(this.o);
      GL11.glTexImage2D(3553, 0, 6407, var1, var2, 0, 6407, 5121, var4);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10241, 9729);
      d.z(0);
   }

   public int W() {
      return this.o;
   }

   public void e() {
      d.a(this.o);
      this.o = 0;
   }

   private int Z(int var1) {
      var1 = var1 ^ var1 << 13;
      var1 = var1 ^ var1 >> 17;
      var1 = var1 ^ var1 << 5;
      return var1;
   }

   private byte P(int var1, int var2, int var3) {
      int var4 = (this.Z(var1) + this.Z(var2 * 19)) * this.Z(var3 * 23) - var3;
      return (byte)(this.Z(var4) % 128);
   }

   private byte[] u(int var1, int var2) {
      uv.l();
      byte[] var4 = new byte[var1 * var2 * 3];
      int var5 = 0;
      int var6 = 0;
      if(var6 < var2) {
         int var7 = 0;
         if(var7 < var1) {
            int var8 = 1;
            var4[var5++] = this.P(var7, var6, var8);
            ++var8;
            ++var7;
         }

         ++var6;
      }

      return var4;
   }

   public int q() {
      return this.o;
   }

   public int A() {
      this.getClass();
      return 15;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
