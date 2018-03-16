/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java11_2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
public class java11_8 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String[] profile(String data){
      String[] data1={"1","1976年10月14日","大阪府"};
      String[] data2 ={"2","1988年3月4日",null};
      String[] data3 ={"3","1996年11月23日","東京都"};
      String[] data4;
      data4 = new String[2];
        if(data.equals(data1[0])){
            data4= data1;
            return data4;
        }else if(data.equals(data2[0])){
            data4= data2;
            return data4;
        }else if(data.equals(data3[0])){
            data4= data3;
            return data4;
        }else{
            data4[0]="一致するIDはありません";
            return data4;
        } 
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet java11_8</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
            //二つのfor文。一つ目でいくつめの配列か、二つ目で配列の中身をそれぞれ表示。
           
            for(int i=1;i<4;i++){
                int limit =2;
                if(limit<i){
                        break;
                    }
                String str =String.valueOf(i);
                
                for(int b=0;b<3;b++){
                    if(profile(str)[b]==null){
                     continue;
                     }
                    
                    out.println(profile(str)[b]);
                
                }
                
            }
            
            //for(int i=0;i<3;i++){
              //  if(profile("2")[i]==null){
                //continue;
               // }
                //out.println(profile("2")[i]);
                
            //}
            //for(int i=0;i<3;i++){
              //  out.println(profile("3")[i]);
            //}
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
