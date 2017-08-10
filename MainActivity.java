public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
 
    EditText selectiontext;
    ListView chooseImageList;
    String[] listofImages;
    ProgressBar downloadImageProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagedownload);
        selectiontext = (EditText) findViewById(R.id.urlselectionText);
        chooseImageList = (ListView) findViewById(R.id.chooseImageList);
        downloadImageProgress = (ProgressBar) findViewById(R.id.downloadProgress);
        listofImages = getResources().getStringArray(R.array.imageuris);
        chooseImageList.setOnItemClickListener(this);
    }

    public void downloadImage(View view) {
        if (selectiontext.getText().toString() != null
                && (selectiontext.getText().toString().length()) > 0) {
           // create instance of subClass (MyTask).
           // call method execute() on it and it accepts text read from textview as parameter.
        }


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        selectiontext.setText(listofImages[position]);
    }

    class MyTask1 extends AsyncTask<String,Integer,Boolean>{
        
        @Override
        protected void onPreExecute() {
            //set visibility of progessbar to visible
        }

        @Override
        protected Boolean doInBackground(String... params) {
        
        // Ceate an instance of URL, HttpURLConnection, InputStream, FileOutputStream,File class
        // Create a boolean variable successfull and set its intial value to false
        // if image download succesfully set it to true. return a boolean value of success 
        // Write a code that download the image from internet
        // count how many bytes are downloded for that image and use this count to show the progress
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
          //calculate the progress and show it on progressbar
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            //set visibility of progessbar to gone
        }
    }



}
