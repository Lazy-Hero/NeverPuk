package net.y;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.y.d;
import net.y.p;
import org.lwjgl.util.glu.GLU;

public class m {
   public static synchronized int X(int var0) {
      p.S();
      int var2 = d.z(var0);
      if(var2 == 0) {
         int var3 = d.z();
         String var4 = "No error code reported";
         if(var3 != 0) {
            var4 = GLU.gluErrorString(var3);
         }

         throw new IllegalStateException("glGenLists returned an ID of 0 for a count of " + var0 + ", GL error (" + var3 + "): " + var4);
      } else {
         return var2;
      }
   }

   public static synchronized void g(int var0, int var1) {
      d.N(var0, var1);
   }

   public static synchronized void Q(int var0) {
      g(var0, 1);
   }

   public static synchronized ByteBuffer T(int var0) {
      return ByteBuffer.allocateDirect(var0).order(ByteOrder.nativeOrder());
   }

   public static IntBuffer z(int var0) {
      return T(var0 << 2).asIntBuffer();
   }

   public static FloatBuffer R(int var0) {
      return T(var0 << 2).asFloatBuffer();
   }

   private static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }
}
