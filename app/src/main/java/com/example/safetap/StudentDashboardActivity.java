package com.example.safetap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class StudentDashboardActivity extends AppCompatActivity {

    private Button btnClinic, btnSecurity, btnGuidance, btnService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_dashboard);

        // Initialize buttons
        btnClinic = findViewById(R.id.btnClinic);
        btnSecurity = findViewById(R.id.btnSecurity);
        btnGuidance = findViewById(R.id.btnGuidance);
        btnService = findViewById(R.id.btnService);

        // Set button click listeners
        btnClinic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to Clinic Admin Dashboard (or functionality)
                Toast.makeText(StudentDashboardActivity.this, "Clinic Selected", Toast.LENGTH_SHORT).show();
                // Intent intent = new Intent(StudentDashboardActivity.this, ClinicDashboardActivity.class);
                // startActivity(intent);
            }
        });

        btnSecurity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to Security Admin Dashboard (or functionality)
                Toast.makeText(StudentDashboardActivity.this, "Security Selected", Toast.LENGTH_SHORT).show();
                // Intent intent = new Intent(StudentDashboardActivity.this, SecurityDashboardActivity.class);
                // startActivity(intent);
            }
        });

        btnGuidance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to Guidance Admin Dashboard (or functionality)
                Toast.makeText(StudentDashboardActivity.this, "Guidance Selected", Toast.LENGTH_SHORT).show();
                // Intent intent = new Intent(StudentDashboardActivity.this, GuidanceDashboardActivity.class);
                // startActivity(intent);
            }
        });

        btnService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to Service Admin Dashboard (or functionality)
                Toast.makeText(StudentDashboardActivity.this, "Service Selected", Toast.LENGTH_SHORT).show();
                // Intent intent = new Intent(StudentDashboardActivity.this, ServiceDashboardActivity.class);
                // startActivity(intent);
            }
        });
    }
}