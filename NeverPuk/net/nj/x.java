package net.nj;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.annotation.Nullable;
import net.nj.b;
import net.nj.f;
import net.nj.o;
import net.nj.q;

public class x {
   public static f r(InputStream var0) throws IOException {
      DataInputStream var1 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(var0)));
      f var2 = j(var1, o.d);
      var1.close();
      return var2;
   }

   public static void z(f var0, OutputStream var1) throws IOException {
      DataOutputStream var2 = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(var1)));
      T(var0, (DataOutput)var2);
      var2.close();
   }

   public static void q(f var0, File var1) throws IOException {
      int var10000 = q.H();
      File var3 = new File(var1.getAbsolutePath() + "_tmp");
      int var2 = var10000;
      if(var3.exists()) {
         var3.delete();
      }

      T(var0, var3);
      if(var1.exists()) {
         var1.delete();
      }

      if(var1.exists()) {
         throw new IOException("Failed to delete " + var1);
      } else {
         var3.renameTo(var1);
         if(net.u.d.y() == null) {
            ++var2;
            q.B(var2);
         }

      }
   }

   public static void T(f var0, File var1) throws IOException {
      DataOutputStream var2 = new DataOutputStream(new FileOutputStream(var1));
      T(var0, (DataOutput)var2);
      var2.close();
   }

   @Nullable
   public static f K(File var0) throws IOException {
      if(!var0.exists()) {
         return null;
      } else {
         DataInputStream var1 = new DataInputStream(new FileInputStream(var0));
         f var2 = j(var1, o.d);
         var1.close();
         return var2;
      }
   }

   public static f f(DataInputStream var0) throws IOException {
      return j(var0, o.d);
   }

   public static f j(DataInput var0, o var1) throws IOException {
      q var2 = S(var0, 0, var1);
      if(var2 instanceof f) {
         return (f)var2;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void T(f var0, DataOutput var1) throws IOException {
      s(var0, var1);
   }

   private static void s(q var0, DataOutput var1) throws IOException {
      var1.writeByte(var0.C());
      if(var0.C() != 0) {
         var1.writeUTF("");
         var0.J(var1);
      }

   }

   private static q S(DataInput var0, int var1, o var2) throws IOException {
      byte var3 = var0.readByte();
      return new b();
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
