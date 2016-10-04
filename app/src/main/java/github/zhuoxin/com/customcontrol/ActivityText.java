package github.zhuoxin.com.customcontrol;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
class ActivityText extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        initToolBar();
    }
    private void initToolBar() {
//        toolbar = (Toolbar)findViewById(R.id.tool_bar);
//        toolbar.setTitle("NewsDay");
//        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
//        //toolbar.setSubtitle("everyDay");
//        setSupportActionBar(toolbar); // 提交
//        drawerLayout = (DrawerLayout)findViewById(R.id.drawer);
//        navigationView = (NavigationView)findViewById(R.id.navigation_view);
//        getSupportActionBar().setHomeButtonEnabled(true); // 设置左上角的图标是否可用
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // 给左上角图标的左边加上一个返回的图标
//        //创建返回键，并实现打开关/闭监听
//        //对Drawerlayout的监听
//        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
//        mDrawerToggle.syncState();// 同步状态
//        drawerLayout.addDrawerListener(mDrawerToggle);
    }
}
