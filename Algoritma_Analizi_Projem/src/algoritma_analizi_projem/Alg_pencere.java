/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algoritma_analizi_projem;

/**
 *
 * @author Dilara
 */
import java.util.Arrays;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Collections; 
import java.util.Vector;
public class Alg_pencere extends javax.swing.JFrame {

    /**
     * Creates new form Alg_pencere
     */
    public Alg_pencere() {
        initComponents();
    }
    void merge(int arr[], int l, int m, int r)
    {
       
        int n1 = m - l + 1;
        int n2 = r - m;
 
      
        int L[] = new int[n1];
        int R[] = new int[n2];
 
      
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        
        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
          
            int m = (l + r) / 2;
 
      
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
          
            merge(arr, l, m, r);
        }
    }
 


    
    private void Mergesort(String elemansayisi){
     long start = System.currentTimeMillis();
               Random randuret = new Random();
               int elemansy= Integer.parseInt(elemansayisi);
               int wer= elemansy;
               String inputarray="";
               String tab=" ";
        int arr[] = new int[elemansy];
            for(int a=0;a<elemansy;a++)
    { arr[a]=randuret.nextInt(100);
      inputarray =inputarray.concat(Integer.toString(arr[a]))+tab;
    }
      
       sort(arr, 0, arr.length - 1);
 
        long end = System.currentTimeMillis();
        long toplamTime = end - start;
        
        
        int result = (int)((Math.log(arr.length) / Math.log(2))*(7/2)+(Math.log(arr.length) / Math.log(2))*(2*arr.length+9)); 

        JFrame f=new JFrame();  
        JOptionPane.showMessageDialog(f,"süre(milisaniye):"+toplamTime+"   "+"algoritma merge sort"+"   "+"iterasyon sayısı"+result+"   "+" sıralanmamış dizi"+inputarray,"Information",JOptionPane.WARNING_MESSAGE);
        Print(arr);
        // sıralama için yapılan işlem sayısı,
        // kullanılan algoritma bilgilerini paylaşacaktır.

    }
    private void Print(int [] array){
        String  outarray="";
        String tab=" ";
        for(int i=0;i<array.length;i++){
            outarray =outarray.concat(Integer.toString(array[i]))+tab;
           
            
        }
         JFrame f=new JFrame(); 
        JOptionPane.showMessageDialog(f,"sıralanmış dizi:"+outarray,"Information",JOptionPane.WARNING_MESSAGE);
        
        
        System.out.println(outarray);
    }
    private void Printf(float [] array){
        String  outarray="";
        String tab=" ";
        for(int i=0;i<array.length;i++){
            outarray =outarray.concat(Float.toString(array[i]))+tab;
           
            
        }
         JFrame f=new JFrame(); 
        JOptionPane.showMessageDialog(f,"sıralanmış dizi:"+outarray,"Information",JOptionPane.WARNING_MESSAGE);
        
        
        System.out.println(outarray);
    }
    
    
    private void Insertionsrt(int [] array){
     int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  }
    private void Insertionsort(String elemansayisi){
        long start = System.currentTimeMillis();
               Random randuret = new Random();
               int elemansy= Integer.parseInt(elemansayisi);
               String inputarray="";
               String tab=" ";
        int arr[] = new int[elemansy];
            for(int a=0;a<elemansy;a++)
    { arr[a]=randuret.nextInt(100);
      inputarray =inputarray.concat(Integer.toString(arr[a]))+tab;
    }
            Insertionsrt(arr);
 
        long end = System.currentTimeMillis();
        long toplamTime = end - start;
        
        int result= 7*(arr.length*arr.length)-(3*arr.length) -2;

        JFrame f=new JFrame();  
        JOptionPane.showMessageDialog(f,"süre(milisaniye):"+toplamTime+"    "+"algoritma insertion sort algoritmasıdır."+"    "+"iterasyon sayısı:"+result+"    "+" sıralanmamış dizi"+inputarray,"Information",JOptionPane.WARNING_MESSAGE);
        Print(arr);
            
    }
        public static void hpsort(int arr[])
    {
        int n = arr.length;
 
       
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
       
        for (int i = n - 1; i > 0; i--) {
        
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
          
            heapify(arr, i, 0);
        }
    }
 
   static void heapify(int arr[], int n, int i)
    {
        int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
 
       
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
         if (r < n && arr[r] > arr[largest])
            largest = r;
 
       
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
             heapify(arr, n, largest);
        }
    }

    private void Heapsort(String elemansayisi){
        long start = System.currentTimeMillis();
               Random randuret = new Random();
               int elemansy= Integer.parseInt(elemansayisi);
               String inputarray="";
               String tab=" ";
        int arr[] = new int[elemansy];
            for(int a=0;a<elemansy;a++)
    { arr[a]=randuret.nextInt(100);
      inputarray =inputarray.concat(Integer.toString(arr[a]))+tab;
    }
        
        hpsort(arr);
        long end = System.currentTimeMillis();
        long toplamTime = end - start;
        
        
       int x=arr.length;
       int result= (int)(2+ x/2*(10*(Math.log(arr.length-1) / Math.log(2)))+x/2+x+(x-1)*(3+(Math.log(arr.length-1) / Math.log(2)))) ;

        JFrame f=new JFrame();  
        JOptionPane.showMessageDialog(f,"süre(milisaniye):"+toplamTime+"    "+"iterasyon sayısı:"+result+"    "+"algoritma heapsort algoritmasıdır"+"    "+" sıralanmamış dizi"+inputarray,"Information",JOptionPane.WARNING_MESSAGE);
        Print(arr);
    }
    int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) 
        { 
           
            if (arr[j] < pivot) 
            { 
                i++; 
  
            
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
     
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
  
 
    void qucsort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
       
            int pi = partition(arr, low, high); 
  
      
            qucsort(arr, low, pi-1); 
            qucsort(arr, pi+1, high); 
        } 
    } 
    private void Quicksort(String elemansayisi){
        long start = System.currentTimeMillis();
               Random randuret = new Random();
               int elemansy= Integer.parseInt(elemansayisi);
               String inputarray="";
               String tab=" ";
        int arr[] = new int[elemansy];
            for(int a=0;a<elemansy;a++)
    { arr[a]=randuret.nextInt(100);
      inputarray =inputarray.concat(Integer.toString(arr[a]))+tab;
    }
      int n = arr.length;
      qucsort(arr,0,n-1);
       long end = System.currentTimeMillis();
        long toplamTime = end - start;
        
      int  result=(int)((1+(Math.log(arr.length) / Math.log(2))*(3*arr.length+12))+((Math.log(arr.length) / Math.log(2))*(3*arr.length+15)));
        
        JFrame f=new JFrame();  
        JOptionPane.showMessageDialog(f,"süre(milisaniye):"+toplamTime+"     "+"algoritma quicksort algoritmasıdır. "+"   "+" iterasyon sayısı:"+result+"     "+" sıralanmamış dizi"+inputarray,"Information",JOptionPane.WARNING_MESSAGE);
        Print(arr);
      
    
    }
    void countSort(int[] arr) 
    { 
        int max = Arrays.stream(arr).max().getAsInt(); 
        int min = Arrays.stream(arr).min().getAsInt(); 
        int range = max - min + 1; 
        int count[] = new int[range]; 
        int output[] = new int[arr.length]; 
        for (int i = 0; i < arr.length; i++) { 
            count[arr[i] - min]++; 
        } 
  
        for (int i = 1; i < count.length; i++) { 
            count[i] += count[i - 1]; 
        } 
  
        for (int i = arr.length - 1; i >= 0; i--) { 
            output[count[arr[i] - min] - 1] = arr[i]; 
            count[arr[i] - min]--; 
        } 
  
        for (int i = 0; i < arr.length; i++) { 
            arr[i] = output[i]; 
        } 
    } 

    private void Countingsort(String elemansayisi){
         long start = System.currentTimeMillis();
               Random randuret = new Random();
               int elemansy= Integer.parseInt(elemansayisi);
               String inputarray="";
               String tab=" ";
        int arr[] = new int[elemansy];
            for(int a=0;a<elemansy;a++)
    { arr[a]=randuret.nextInt(100);
      inputarray =inputarray.concat(Integer.toString(arr[a]))+tab;
    }
         countSort(arr);
        long end = System.currentTimeMillis();
        long toplamTime = end - start;
        
       int result=12+8*arr.length;
        
        JFrame f=new JFrame();  
        JOptionPane.showMessageDialog(f,"süre(milisaniye):"+toplamTime+"    "+"algoritma countingsort algoritmasıdır."+"    "+"iterasyon sayısı:"+result+"    "+" sıralanmamış dizi"+inputarray,"Information",JOptionPane.WARNING_MESSAGE);
        Print(arr);
    }
    static int getMax(int arr[], int n) 
    { 
        int mx = arr[0]; 
        for (int i = 1; i < n; i++) 
            if (arr[i] > mx) 
                mx = arr[i]; 
        return mx; 
    } 
  
 
    static void RxSort(int arr[], int n, int exp) 
    { 
        int output[] = new int[n]; 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count, 0); 
  
    
        for (i = 0; i < n; i++) 
            count[(arr[i] / exp) % 10]++; 
  
     
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
  
        
        for (i = n - 1; i >= 0; i--) { 
            output[count[(arr[i] / exp) % 10] - 1] = arr[i]; 
            count[(arr[i] / exp) % 10]--; 
        } 
  
        
        for (i = 0; i < n; i++) 
            arr[i] = output[i]; 
    } 
        static void Rx2sort(int arr[], int n) 
    { 
        
        int m = getMax(arr, n); 
  
         for (int exp = 1; m / exp > 0; exp *= 10) 
            RxSort(arr, n, exp); 
    } 

     private void Radixsort(String elemansayisi){
         long start = System.currentTimeMillis();
               Random randuret = new Random();
               int elemansy= Integer.parseInt(elemansayisi);
               String inputarray="";
               String tab=" ";
        int arr[] = new int[elemansy];
            for(int a=0;a<elemansy;a++)
    { arr[a]=randuret.nextInt(100);
      inputarray =inputarray.concat(Integer.toString(arr[a]))+tab;
    }
           int n= arr.length;
            Rx2sort(arr, n); 
             long end = System.currentTimeMillis();
        long toplamTime = end - start;
        
      int result=26+7*arr.length;
        
        JFrame f=new JFrame();  
        JOptionPane.showMessageDialog(f,"süre(milisaniye):"+toplamTime+"    "+"algoritma radixsort algoritmasıdır."+"    "+"iterasyon sayısı:"+result+"    "+" sıralanmamış dizi"+inputarray,"Information",JOptionPane.WARNING_MESSAGE);
        Print(arr);
            
     }
       void bucktSort(float arr[], int n) 
  { 
    if (n <= 0) 
      return; 

  
    @SuppressWarnings("unchecked") 
    Vector<Float>[] buckets = new Vector[n]; 

    for (int i = 0; i < n; i++) { 
      buckets[i] = new Vector<Float>(); 
    } 

    for (int i = 0; i < n; i++) { 
      float idx = arr[i] * n; 
      buckets[(int)idx].add(arr[i]); 
    } 

  
    for (int i = 0; i < n; i++) { 
      Collections.sort(buckets[i]); 
    } 

    int index = 0; 
    for (int i = 0; i < n; i++) { 
      for (int j = 0; j < buckets[i].size(); j++) { 
        arr[index++] = buckets[i].get(j); 
      } 
    } 
  } 

     private void Bucketsort(String elemansayisi){
         long start = System.currentTimeMillis();
               Random randuret = new Random();
               int elemansy= Integer.parseInt(elemansayisi);
               String inputarray="";
               String tab=" ";
        float arr[] = new float[elemansy];
            for(int a=0;a<elemansy;a++)
    { arr[a]=(float)randuret.nextInt(100)/1000;
      inputarray =inputarray.concat(Float.toString(arr[a]))+tab;
    }
            int n = arr.length; 
            bucktSort(arr, n); 
        long end = System.currentTimeMillis();
        long toplamTime = end - start;
        
        int result= 18+18*n;

        JFrame f=new JFrame();  
        JOptionPane.showMessageDialog(f,"süre(milisaniye):"+toplamTime+"    "+"algoritma bucketsort algoritmasıdır."+"    "+"iterasyon sayısı:"+result+"    "+ " sıralanmamış dizi"+inputarray,"Information",JOptionPane.WARNING_MESSAGE);
        Printf(arr);     
     }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aramasayfa = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        siralamasayfa = new javax.swing.JFrame();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar3 = new javax.swing.JMenuBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        arama = new javax.swing.JMenu();
        siralama = new javax.swing.JMenu();

        aramasayfa.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        aramasayfa.setBackground(new java.awt.Color(204, 204, 255));
        aramasayfa.setLocation(new java.awt.Point(100, 100));
        aramasayfa.setMinimumSize(new java.awt.Dimension(1077, 702));

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 51, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ALGORİTMA DERSİ PROJESİ");
        jLabel4.setAlignmentX(0.5F);

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Aranacak Sayı");

        jTextField2.setMinimumSize(new java.awt.Dimension(41, 26));

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doğrusal Arama", "İkili Arama" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Seçilecek Algoritma");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Bul");
        jButton1.setMaximumSize(new java.awt.Dimension(10, 10));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        aramasayfa.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout aramasayfaLayout = new javax.swing.GroupLayout(aramasayfa.getContentPane());
        aramasayfa.getContentPane().setLayout(aramasayfaLayout);
        aramasayfaLayout.setHorizontalGroup(
            aramasayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aramasayfaLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(44, 44, 44)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239)
                .addGroup(aramasayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aramasayfaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(55, 55, 55)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );
        aramasayfaLayout.setVerticalGroup(
            aramasayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aramasayfaLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(aramasayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(aramasayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(aramasayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(110, 110, 110)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 373, Short.MAX_VALUE))
        );

        siralamasayfa.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        siralamasayfa.setBackground(new java.awt.Color(204, 204, 255));
        siralamasayfa.setLocation(new java.awt.Point(100, 100));
        siralamasayfa.setMinimumSize(new java.awt.Dimension(1077, 702));

        jLabel7.setBackground(new java.awt.Color(204, 204, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 51, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ALGORİTMA DERSİ PROJESİ");
        jLabel7.setAlignmentX(0.5F);

        jLabel8.setBackground(new java.awt.Color(204, 204, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Sıralanacak sayı adedi");

        jTextField3.setMinimumSize(new java.awt.Dimension(30, 26));
        jTextField3.setPreferredSize(new java.awt.Dimension(30, 26));

        jComboBox3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Merge Sort", "Heap Sort", "Araya Yerleştirme (Insertion Sort)", "Quick Sort", "Counting Sort(Sayma Sıralaması)", "Radix (Taban) Sıralaması", "Bucket Sort" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Seçilecek Algoritma");

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Sırala");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        siralamasayfa.setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout siralamasayfaLayout = new javax.swing.GroupLayout(siralamasayfa.getContentPane());
        siralamasayfa.getContentPane().setLayout(siralamasayfaLayout);
        siralamasayfaLayout.setHorizontalGroup(
            siralamasayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(siralamasayfaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(44, 44, 44)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239)
                .addComponent(jLabel9)
                .addGap(55, 55, 55)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(siralamasayfaLayout.createSequentialGroup()
                .addGap(465, 465, 465)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        siralamasayfaLayout.setVerticalGroup(
            siralamasayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(siralamasayfaLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(siralamasayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(siralamasayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(siralamasayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(86, 86, 86)
                .addComponent(jButton2)
                .addGap(0, 368, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setLocation(new java.awt.Point(100, 100));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALGORİTMA DERSİ PROJESİ");
        jLabel1.setAlignmentX(0.5F);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dilara Kanalıcı 18360859013");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("(yukarıdaki menüden işlem seçiniz.)");

        arama.setForeground(new java.awt.Color(153, 102, 255));
        arama.setText("Arama");
        arama.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        arama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aramaMouseClicked(evt);
            }
        });
        jMenuBar1.add(arama);

        siralama.setForeground(new java.awt.Color(153, 102, 255));
        siralama.setText("Sıralama");
        siralama.setActionCommand("siralama");
        siralama.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        siralama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siralamaMouseClicked(evt);
            }
        });
        jMenuBar1.add(siralama);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1047, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 251, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void aramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aramaMouseClicked
        // TODO add your handling code here:
        pencerecalis(false);
        
       aramasayfa.setVisible(true);
    }//GEN-LAST:event_aramaMouseClicked

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void siralamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siralamaMouseClicked
        // TODO add your handling code here:
         pencerecalis(false);
       
       siralamasayfa.setVisible(true);
    }//GEN-LAST:event_siralamaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         String girdisayi= jTextField3.getText();
         Object secilen=jComboBox3.getSelectedItem();
        //Sıralama sonucu olarak , sıralama sonucu oluşan veri, sıralama için yapılan işlem sayısı,
        //sıralama için geçen süre, sıralamada kullanılan veri seti ve kullanılan algoritma bilgilerini paylaşacaktır.
        if(secilen==jComboBox3.getItemAt(0)){ //merge sort
        Mergesort(girdisayi);
        System.out.printf("hey sen");
        }
        if(secilen==jComboBox3.getItemAt(1)){ //heap sort
            Heapsort(girdisayi);
        }
        if(secilen==jComboBox3.getItemAt(2)){ //insertion sort
            Insertionsort(girdisayi);
            
        }
        if(secilen==jComboBox3.getItemAt(3)){ //quick sort
            Quicksort(girdisayi);
        }
        if(secilen==jComboBox3.getItemAt(4)){ //counting sort
            Countingsort(girdisayi);
        }
        if(secilen==jComboBox3.getItemAt(5)){ //radix sort
            Radixsort(girdisayi);
        }
        if(secilen==jComboBox3.getItemAt(6)){ //bucket sort
            Bucketsort(girdisayi);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Arama sonucu olarak aranan değerin olup olmadığı, bulunduğu indeks, arama için yapılan işlem sayısı,
        //aramada kullanılan veri seti, arama için geçen süre ve kullanılan algoritma bilgilerini paylaşacaktır.
        String istenensayi= jTextField2.getText();
        Object secilen=jComboBox2.getSelectedItem();
        
        if(secilen==jComboBox2.getItemAt(0)){ //doğrusal arama
        
        Linearsearch(istenensayi);
        }
        System.out.println(jComboBox2.getItemAt(1));
        if(secilen==jComboBox2.getItemAt(1)){ //ikili arama

          Binarysearch(istenensayi); 
        }  
       
    }//GEN-LAST:event_jButton1ActionPerformed
     private void linear(String aranan, int [] arr){
          int arananint= Integer.parseInt(aranan);
          boolean var=false;
          int kactane=0;
          
         for(int i=0;i<arr.length;i++)
    { 
      if(arr[i]==arananint){
      var=true;
       kactane+=1;
      JFrame t=new JFrame();  
        JOptionPane.showMessageDialog(t," bu dizi aranan değeri içermektedir"+"    "+"bulunduğu indeks:"+i,"Information",JOptionPane.WARNING_MESSAGE);
 }

     
    }
        int result=2*arr.length+5+4*kactane;
         JFrame c=new JFrame();  
        JOptionPane.showMessageDialog(c," toplam iterasyon sayısı:"+result+"    ","Information",JOptionPane.WARNING_MESSAGE);
 

         if(kactane==0){
            JFrame f=new JFrame();  
        JOptionPane.showMessageDialog(f,"bu dizi bu elemanı içermemektedir"+"    "+"iterasyon sayısı:"+result,"Information",JOptionPane.WARNING_MESSAGE);
         
         }

     }//aramada kullanılan veri seti, arama için geçen süre ve kullanılan algoritma bilgilerini paylaşacaktır.
    private void Linearsearch(String aranan){
         long start = System.currentTimeMillis();
               Random randuret = new Random();
               String inputarray="";
               String tab=" ";
        int arr[] = new int[30];
            for(int a=0;a<30;a++)
    { arr[a]=randuret.nextInt(100);
      inputarray =inputarray.concat(Integer.toString(arr[a]))+tab;
    }
            
            linear(aranan, arr);
           
        long end = System.currentTimeMillis();
        long toplamTime = end - start;
         JFrame f=new JFrame();  
        JOptionPane.showMessageDialog(f,"veri seti"+inputarray+"    "+"süre(milisaniye)"+toplamTime+"    "+"linearsearch algoritması kullanılmıştır","Information",JOptionPane.WARNING_MESSAGE);
         
          
      }
    private void Binarysearch(String aranan){
long start = System.currentTimeMillis();
               Random randuret = new Random();
               String inputarray="";
               String tab=" ";
        int arr[] = new int[30];
            for(int a=0;a<30;a++)
    { arr[a]=randuret.nextInt(1)+a;
      inputarray =inputarray.concat(Integer.toString(arr[a]))+tab;
    }
        int arananint= Integer.parseInt(aranan);
    binsrch(arr,arananint);
    
      long end = System.currentTimeMillis();
        long toplamTime = end - start;
        
        JFrame f=new JFrame();  
        JOptionPane.showMessageDialog(f,"veri seti"+inputarray+"    "+"süre(milisaniye)"+toplamTime+"    "+"binarysearch algoritması kullanılmıştır","Information",JOptionPane.WARNING_MESSAGE);
         
        
    }
    private void binsrch(int arr[], int aranan){
      int  kactane=0;
      int low = 0, high = arr.length - 1;
      while (low <= high)
{
         int mid = (low + high) / 2;           

      if (aranan == arr[mid]){
        kactane+=1;
        JFrame t=new JFrame();  
        JOptionPane.showMessageDialog(t," bu dizi aranan değeri içermektedir"+"    "+"bulunduğu indeks:"+mid,"Information",JOptionPane.WARNING_MESSAGE);
        break;
      }
      else if (aranan < arr[mid]) {
	high = mid - 1;
			}

      else
       low = mid + 1;
    }


     int result=(int)(3+(5*(Math.log(arr.length) / Math.log(2))));
         JFrame c=new JFrame();  
        JOptionPane.showMessageDialog(c," toplam iterasyon sayısı:"+result+"    ","Information",JOptionPane.WARNING_MESSAGE);
 

         if(kactane==0){
            JFrame f=new JFrame();  
        JOptionPane.showMessageDialog(f,"bu dizi bu elemanı içermemektedir"+"    "+"iterasyon sayısı:"+result,"Information",JOptionPane.WARNING_MESSAGE);
       
    

    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Alg_pencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alg_pencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alg_pencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alg_pencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alg_pencere().setVisible(true);
               
            }
        });
         
    }
    public  void pencerecalis(boolean durum){
       if(durum==false){

           this.dispose();
       }
       
    }

     
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu arama;
    private javax.swing.JFrame aramasayfa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JMenu siralama;
    private javax.swing.JFrame siralamasayfa;
    // End of variables declaration//GEN-END:variables
}
