package github.zhuoxin.com.customcontrol;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar= (Toolbar) findViewById(R.id.toobar);
        drawerLayout= (DrawerLayout) findViewById(R.id.drawerLayout);
        n= (NavigationView) findViewById(R.id.NavigationView);
        toolbar.setTitle("杨氏练习法则");
        toolbar.setTitleTextColor(Color.parseColor("#0000ff"));
        setSupportActionBar(toolbar);//核心点
        ActionBarDrawerToggle drawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.app_name,R.string.app_name);
        //// 对Drawer监听 这个监听别人已经实现了 我们直接先使用 需要注意的是我们需要关联到我们的ToolBar
        drawerToggle.syncState();//// 同步状态
        drawerLayout.addDrawerListener(drawerToggle);//// 对我们的DrawerLayout设置上监听 关于滑动的动画 ActionBarDrawerToggle在做实现  我们不需要去管理
        n.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    // 选择情况下执行的相关操作
                    case R.id.drawer_me:
                        Toast.makeText(MainActivity.this,"me click",Toast.LENGTH_SHORT).show();
                        break;
                    //........
                }
                // 注意返回值
                return true;
            }
        });
    }
}
