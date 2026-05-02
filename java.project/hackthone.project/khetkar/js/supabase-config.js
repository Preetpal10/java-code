import { createClient } from 'https://cdn.jsdelivr.net/npm/@supabase/supabase-js/+esm'

const SUPABASE_URL = 'https://nnlnfiyhtbqxilfmwgii.supabase.co'
const SUPABASE_KEY = 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Im5ubG5maXlodGJxeGlsZm13Z2lpIiwicm9sZSI6ImFub24iLCJpYXQiOjE3Nzc3MTQwMDcsImV4cCI6MjA5MzI5MDAwN30.0gSwGD_Mwb2KxFizlwPyQ8EDYvak07_eJ_ZRzRhGKbM'

export const supabase = createClient(SUPABASE_URL, SUPABASE_KEY)