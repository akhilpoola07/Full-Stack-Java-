# Full Stack Java Learning Projects

## Overview

This repository collects Java programming exercises and small console projects, alongside **Unilinka**, a React web application for browsing and submitting academic learning resources. The Java portion covers introductory language concepts and object-oriented programming. The web application includes student and faculty views, authentication flows, resource browsing, and resource upload interfaces backed by Supabase client calls.

The repository does not contain a Spring Boot backend. The web application is a Vite-powered frontend; no server-side API implementation or database schema/migrations are included here.

## Features

- Java examples for data types, conditionals, loops, arrays, strings, collections, generics, exceptions, file handling, and threads.
- Console-based library management and self-improvement tracker projects.
- Unilinka React interface with login and registration, student and faculty dashboards, resource browsing and upload, profile, and settings pages.
- Supabase client integration for authentication, resource data, and file storage.
- Firebase client setup and helper modules are present in the frontend source.

## Technologies Used

- Java (standalone source files; no Java build tool configuration is included)
- JavaScript (ES modules) and React 18
- Vite
- React Router
- Supabase JavaScript client
- Firebase JavaScript SDK
- Tailwind CSS, PostCSS, and Autoprefixer
- Additional frontend dependencies are listed in `Unilinka/Unilinka/package.json`.

## Project Structure

```text
.
├── DAY1/ ... DAY7/       # Java learning exercises, organized by topic/day
├── Day12/                 # Java threading examples
├── Projects/              # Java exercises and user model examples
├── SelfImprovement/       # Console-based tracker project
├── project1/src/          # Console-based library management project
├── Unilinka/Unilinka/     # React + Vite frontend application
│   ├── public/            # Static assets
│   ├── src/               # Routes, pages, components, contexts, and clients
│   ├── package.json       # Frontend dependencies and scripts
│   └── vite.config.mjs
├── *.java                 # Additional standalone Java exercises
├── .gitignore
└── README.md
```

## Prerequisites

- A JDK for compiling and running the Java examples.
- Node.js and npm for the Unilinka frontend.
- Supabase project credentials to use the frontend's Supabase-backed flows. Firebase configuration is also read by the Firebase client module.

## Installation

Clone the repository, then install the frontend dependencies:

```bash
git clone https://github.com/akhilpoola07/Full-Stack-Java-.git
cd Full-Stack-Java-
cd Unilinka/Unilinka
npm install
```

## Configuration

Create `Unilinka/Unilinka/.env.local` for local Vite configuration. Do not commit real credentials. The Supabase client reads these required variables:

```dotenv
VITE_SUPABASE_URL=your_supabase_url
VITE_SUPABASE_ANON_KEY=your_supabase_anon_key
```

The Firebase client reads the following configuration values:

```dotenv
VITE_FIREBASE_API_KEY=your_firebase_api_key
VITE_FIREBASE_AUTH_DOMAIN=your_firebase_auth_domain
VITE_FIREBASE_PROJECT_ID=your_firebase_project_id
VITE_FIREBASE_STORAGE_BUCKET=your_firebase_storage_bucket
VITE_FIREBASE_MESSAGING_SENDER_ID=your_firebase_messaging_sender_id
VITE_FIREBASE_APP_ID=your_firebase_app_id
VITE_FIREBASE_MEASUREMENT_ID=your_firebase_measurement_id
```

Vite exposes `VITE_*` values in the browser bundle. Use only public client-side configuration there, apply appropriate provider-side restrictions, and never put server secrets such as private API keys or service-role keys in frontend variables.

## Running the Project

Start the frontend development server from `Unilinka/Unilinka`:

```bash
npm start
```

Create a production build or preview it locally with:

```bash
npm run build
npm run serve
```

Compile an individual Java example from the repository root, then run its class. For example:

```bash
javac evenodd.java
java evenodd
```

Some Java source files declare packages; compile those from the appropriate source root and use their fully qualified class names.

## Application Routes

These are frontend routes declared in `Unilinka/Unilinka/src/Routes.jsx`; they are not server API endpoints.

| Path | Page |
| --- | --- |
| `/` and `/login` | Login |
| `/student-registration` | Student registration |
| `/student-dashboard`, `/question-papers`, `/curriculum` | Student dashboard views |
| `/faculty-dashboard` | Faculty dashboard |
| `/resource-browse` | Resource browsing |
| `/resource-upload` | Resource upload |
| `/profile` | Profile |
| `/settings` | Settings |

No backend HTTP API endpoints are defined in this repository. Data operations are made from the frontend through the Supabase client.

## Database and Storage

The frontend uses Supabase client calls for authentication, database queries, and storage. The repository does not include a database schema or migration files; configure the corresponding Supabase project and policies separately. Firebase client initialization and auth/database/storage helper modules are also present in the source.

## Testing

The frontend includes `src/setupTests.js` and Testing Library dependencies, but `package.json` does not define a test script and no test files are included. There is no configured automated test command. The Java examples do not include a test framework configuration.

## Future Improvements

- Add a documented database schema and setup/migration instructions.
- Add automated tests for the frontend flows and Java projects.
- Add a Java build configuration if these examples are intended to be built together.
- Separate any privileged integrations into a secured server-side service.

## Author

**Poola Akhil**  
GitHub: [akhilpoola07](https://github.com/akhilpoola07)
